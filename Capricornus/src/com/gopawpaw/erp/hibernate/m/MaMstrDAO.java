package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MaMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MaMstr
 * @author MyEclipse Persistence Tools
 */

public class MaMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MaMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MaMstr transientInstance) {
		log.debug("saving MaMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MaMstr persistentInstance) {
		log.debug("deleting MaMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MaMstr findById(com.gopawpaw.erp.hibernate.m.MaMstrId id) {
		log.debug("getting MaMstr instance with id: " + id);
		try {
			MaMstr instance = (MaMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MaMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MaMstr instance) {
		log.debug("finding MaMstr instance by example");
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
		log.debug("finding MaMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MaMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MaMstr instances");
		try {
			String queryString = "from MaMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MaMstr merge(MaMstr detachedInstance) {
		log.debug("merging MaMstr instance");
		try {
			MaMstr result = (MaMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MaMstr instance) {
		log.debug("attaching dirty MaMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MaMstr instance) {
		log.debug("attaching clean MaMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MaMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MaMstrDAO) ctx.getBean("MaMstrDAO");
	}
}