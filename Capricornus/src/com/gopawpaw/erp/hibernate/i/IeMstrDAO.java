package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IeMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IeMstr
 * @author MyEclipse Persistence Tools
 */

public class IeMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IeMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IeMstr transientInstance) {
		log.debug("saving IeMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IeMstr persistentInstance) {
		log.debug("deleting IeMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IeMstr findById(com.gopawpaw.erp.hibernate.i.IeMstrId id) {
		log.debug("getting IeMstr instance with id: " + id);
		try {
			IeMstr instance = (IeMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IeMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IeMstr instance) {
		log.debug("finding IeMstr instance by example");
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
		log.debug("finding IeMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IeMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IeMstr instances");
		try {
			String queryString = "from IeMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IeMstr merge(IeMstr detachedInstance) {
		log.debug("merging IeMstr instance");
		try {
			IeMstr result = (IeMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IeMstr instance) {
		log.debug("attaching dirty IeMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IeMstr instance) {
		log.debug("attaching clean IeMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IeMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IeMstrDAO) ctx.getBean("IeMstrDAO");
	}
}