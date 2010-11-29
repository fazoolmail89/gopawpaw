package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IsvcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IsvcMstr
 * @author MyEclipse Persistence Tools
 */

public class IsvcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IsvcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IsvcMstr transientInstance) {
		log.debug("saving IsvcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IsvcMstr persistentInstance) {
		log.debug("deleting IsvcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IsvcMstr findById(com.gopawpaw.erp.hibernate.i.IsvcMstrId id) {
		log.debug("getting IsvcMstr instance with id: " + id);
		try {
			IsvcMstr instance = (IsvcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IsvcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IsvcMstr instance) {
		log.debug("finding IsvcMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding IsvcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IsvcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IsvcMstr instances");
		try {
			String queryString = "from IsvcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IsvcMstr merge(IsvcMstr detachedInstance) {
		log.debug("merging IsvcMstr instance");
		try {
			IsvcMstr result = (IsvcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IsvcMstr instance) {
		log.debug("attaching dirty IsvcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IsvcMstr instance) {
		log.debug("attaching clean IsvcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IsvcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IsvcMstrDAO) ctx.getBean("IsvcMstrDAO");
	}
}