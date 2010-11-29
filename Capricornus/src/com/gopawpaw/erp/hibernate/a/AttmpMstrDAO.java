package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AttmpMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AttmpMstr
 * @author MyEclipse Persistence Tools
 */

public class AttmpMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AttmpMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AttmpMstr transientInstance) {
		log.debug("saving AttmpMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AttmpMstr persistentInstance) {
		log.debug("deleting AttmpMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AttmpMstr findById(com.gopawpaw.erp.hibernate.a.AttmpMstrId id) {
		log.debug("getting AttmpMstr instance with id: " + id);
		try {
			AttmpMstr instance = (AttmpMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AttmpMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AttmpMstr instance) {
		log.debug("finding AttmpMstr instance by example");
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
		log.debug("finding AttmpMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AttmpMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AttmpMstr instances");
		try {
			String queryString = "from AttmpMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AttmpMstr merge(AttmpMstr detachedInstance) {
		log.debug("merging AttmpMstr instance");
		try {
			AttmpMstr result = (AttmpMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AttmpMstr instance) {
		log.debug("attaching dirty AttmpMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AttmpMstr instance) {
		log.debug("attaching clean AttmpMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AttmpMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AttmpMstrDAO) ctx.getBean("AttmpMstrDAO");
	}
}